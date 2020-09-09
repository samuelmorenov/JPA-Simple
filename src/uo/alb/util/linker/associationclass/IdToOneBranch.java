package uo.alb.util.linker.associationclass;

import uo.alb.util.linker.associationclass.AssociationClassBranch;
import uo.alb.util.linker.associationclass.IdToOneBranch;
import uo.alb.util.linker.AssociationSide;

public class IdToOneBranch implements AssociationClassBranch {

	private AssociationSide idSide;
	private AssociationSide oneSide;

	public IdToOneBranch id(String role, Object value) {
		idSide = AssociationSide.One(role, value);
		return this;
	}

	public IdToOneBranch one(String role, Object value) {
		oneSide = AssociationSide.One(role, value);
		return this;
	}

	@Override
	public AssociationSide getIdSide() {
		return idSide;
	}

	@Override
	public AssociationSide getOtherSide() {
		return oneSide;
	}

	@Override
	public String toString() {
		return "IdToOneBranch [idSide=" + idSide + ", oneSide=" + oneSide + "]";
	}

}
