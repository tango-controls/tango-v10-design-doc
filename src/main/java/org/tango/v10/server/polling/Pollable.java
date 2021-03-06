package org.tango.v10.server.polling;

/**
 * @author ingvord
 * @since 8/19/18
 */
public interface Pollable<T> {
    PollingBuffer getBuffer();
    void poll();
    Iterable<T> getValues();
    T getLatestValue();
}
