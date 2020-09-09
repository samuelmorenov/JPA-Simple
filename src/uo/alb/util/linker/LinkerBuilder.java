package uo.alb.util.linker;

import uo.alb.util.linker.associationclass.AssociationClassLinker;
import uo.alb.util.linker.associationclass.IdToManyBranch;
import uo.alb.util.linker.associationclass.IdToOneBranch;
import uo.alb.util.linker.manytomany.ManyToManyLinker;
import uo.alb.util.linker.onetomany.OneToManyLinker;
import uo.alb.util.linker.onetoone.OneToOneLinker;

public class LinkerBuilder {
	
	public static OneToManyLinker oneToMany() {
		return new OneToManyLinker();
	}

	public static OneToOneLinker oneToOne() {
		return new OneToOneLinker();
	}

	public static ManyToManyLinker manyToMany() {
		return new ManyToManyLinker();
	}

	public static AssociationClassLinker associationClass() {
		return new AssociationClassLinker();
	}

	public static IdToManyBranch idToMany() {
		return new IdToManyBranch();
	}

	public static IdToOneBranch idToOne() {
		return new IdToOneBranch();
	}
}
