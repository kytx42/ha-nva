package com.microsoft.azure.practices.monitor;

import java.io.Closeable;
import java.util.Map;

public interface Monitor extends Closeable {
    void init(Map<String, String> config) throws Exception;
}