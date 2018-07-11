package org.tango.v10.protocol;

/**
 * @author ingvord
 * @since 7/11/18
 */
public interface TangoProtocolFactory {
    TangoProtocol newInstance(ProtocolVersion version);
}
