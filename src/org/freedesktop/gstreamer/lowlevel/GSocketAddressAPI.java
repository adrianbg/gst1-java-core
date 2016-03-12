package org.freedesktop.gstreamer.lowlevel;

import java.util.HashMap;

import org.freedesktop.gstreamer.SocketAddress;
import com.sun.jna.Library;

public interface GSocketAddressAPI extends Library {
	GSocketAddressAPI GSOCKETADDRESS_API = GNative.loadLibrary("gio-2.0",  GSocketAddressAPI.class, new HashMap<String, Object>() {{
        put(Library.OPTION_TYPE_MAPPER, new GTypeMapper());
    }});
	
	public short g_inet_socket_address_get_port(SocketAddress address);
}
