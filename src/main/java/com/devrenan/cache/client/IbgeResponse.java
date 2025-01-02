package com.devrenan.cache.client;

import java.io.Serializable;

public record IbgeResponse (int id, String nome) implements Serializable {
}
