package com.zhuangjie.dp._行为型._2_责任链模式;

import jdk.nashorn.internal.objects.annotations.Constructor;

import java.util.Optional;
public abstract class Handle {
    private Handle childNode;
    public Handle connect(Handle childNode) {
        this.childNode = childNode;
        return childNode;
    }
    public void handle() {
        this.doHandle();
        Optional
                .ofNullable(childNode)
                .ifPresent(handle -> {handle.handle();});
    }
    public abstract void doHandle();
}
