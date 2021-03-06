package com.vyazelenko.blog.copyobject.primitives.serialization.custom;

import com.vyazelenko.blog.copyobject.CopyUtils;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class CustomSeralizationCopy extends CustomSerializationCopyBase implements Serializable {
    public static final transient CustomSeralizationCopy INSTANCE;

    static {
        INSTANCE = new CustomSeralizationCopy();
        INSTANCE.init();
    }

    @Override
    public CustomSeralizationCopy copy() {
        return CopyUtils.copyViaSerialization(this, 600);
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
    }

    private void readObject(ObjectInputStream in) throws IOException,
            ClassNotFoundException {
    }
}
