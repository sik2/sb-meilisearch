package com.ll.meilisearch.global.util;

import com.ll.meilisearch.global.app.AppConfig;
import lombok.SneakyThrows;

public class Ut {
    public static class json {
        @SneakyThrows
        public static String toString(Object obj) {
            return AppConfig.getObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(obj);
        }
    }
}
