package com.github.lipiridi.spotless.applier.action;

import com.github.lipiridi.spotless.applier.ReformatProcessor;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.Project;

public class ReformatAllFilesAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent event) {
        Project project = event.getProject();
        if (project == null) {
            return;
        }

        new ReformatProcessor(project).run();
    }
}