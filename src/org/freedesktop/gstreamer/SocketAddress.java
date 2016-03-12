package org.freedesktop.gstreamer;

import java.util.HashMap;

import org.freedesktop.gstreamer.lowlevel.GNative;
import org.freedesktop.gstreamer.lowlevel.GSocketAddressAPI;
import org.freedesktop.gstreamer.lowlevel.GTypeMapper;

import com.sun.jna.Library;
import com.sun.jna.Pointer;

public class SocketAddress extends GObject {
	GSocketAddressAPI gio = GNative.loadLibrary("gio-2.0",  GSocketAddressAPI.class, new HashMap<String, Object>() {{
        put(Library.OPTION_TYPE_MAPPER, new GTypeMapper());
    }});
	
	public SocketAddress(Initializer init) {
		super(init);
	}
	
	public SocketAddress(Pointer p) {
		this(initializer(p));
	}
	
	public int getPort() {
		return gio.g_inet_socket_address_get_port(this);
	}
}
