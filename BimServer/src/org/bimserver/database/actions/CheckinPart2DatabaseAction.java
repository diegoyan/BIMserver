package org.bimserver.database.actions;

import org.bimserver.database.BimDatabaseException;
import org.bimserver.database.BimDatabaseSession;
import org.bimserver.database.BimDeadlockException;
import org.bimserver.database.CommitSet;
import org.bimserver.database.Database;
import org.bimserver.database.store.ConcreteRevision;
import org.bimserver.database.store.Revision;
import org.bimserver.database.store.log.AccessMethod;
import org.bimserver.ifc.IfcModel;
import org.bimserver.shared.UserException;

public class CheckinPart2DatabaseAction extends BimDatabaseAction<Void> {

	private final IfcModel IfcModel;
	private final long actingUoid;
	private final long croid;

	public CheckinPart2DatabaseAction(AccessMethod accessMethod, IfcModel IfcModel, long actingUoid, long croid) {
		super(accessMethod);
		this.IfcModel = IfcModel;
		this.actingUoid = actingUoid;
		this.croid = croid;
	}

	@Override
	public Void execute(BimDatabaseSession bimDatabaseSession) throws UserException, BimDeadlockException, BimDatabaseException {
		ConcreteRevision concreteRevision = bimDatabaseSession.getConcreteRevision(croid);
		for (Revision revision : concreteRevision.getRevisions()) {
			revision.setFinalized(true);
		}
		concreteRevision.setFinalized(true);
		if (concreteRevision.getProject().getConcreteRevisions().size() != 0) { // TODO: Check if this is not already 1
			// There already was a revision, lets go delete em
			bimDatabaseSession.clearProject(concreteRevision.getProject().getId(), concreteRevision.getId() - 1, concreteRevision.getId());
		}
		concreteRevision.getProject().setLastConcreteRevision(concreteRevision);
		for (Revision virtualRevision : concreteRevision.getProject().getRevisions()) {
			for (ConcreteRevision cr : virtualRevision.getConcreteRevisions()) {
				if (concreteRevision == cr) {
					concreteRevision.getProject().setLastRevision(virtualRevision);
				}
			}
		}
		bimDatabaseSession.store(getIfcModel().getValues(), concreteRevision.getProject().getId(), concreteRevision.getId());
		bimDatabaseSession.store(concreteRevision, new CommitSet(Database.STORE_PROJECT_ID, -1));
		bimDatabaseSession.saveOidCounter();
		return null;
	}

	public IfcModel getIfcModel() {
		return IfcModel;
	}

	public long getActingUid() {
		return actingUoid;
	}

	public long getCroid() {
		return croid;
	}
}