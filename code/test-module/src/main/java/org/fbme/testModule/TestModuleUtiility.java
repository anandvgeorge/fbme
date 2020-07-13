package org.fbme.testModule;

import jetbrains.mps.project.Project;
import org.fbme.ide.iec61499.repository.PlatformRepository;
import org.fbme.ide.platform.PlatformRepositoryProvider;
import org.fbme.lib.common.Declaration;
import org.jetbrains.mps.openapi.model.SNode;

public class TestModuleUtiility {

    private final Project myProject;

    public TestModuleUtiility(Project myProject) {
        this.myProject = myProject;
    }

    public String showDeclarationName(SNode node) {
        PlatformRepository repository = PlatformRepositoryProvider.getInstance(myProject);
        Declaration declaration = repository.getAdapter(node, Declaration.class);
        return declaration.getName();
    }
}
