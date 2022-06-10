package com.zubrycky.lesson.lesson_21_design_patterns.facade;

public class PackageFacade {
    public void sendPackage(Package p) {
        Wrapper wrapper = new Wrapper();
        wrapper.wrap(p);

        LabelMaker labelMaker = new LabelMaker();
        String label = labelMaker.createLabel();

        p.setLabel(label);

        Sender sender = new Sender();
        sender.send(p);
    }
}
