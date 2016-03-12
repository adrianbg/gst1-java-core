package org.freedesktop.gstreamer.lowlevel;

import java.util.HashMap;

import org.freedesktop.gstreamer.Socket;
import org.freedesktop.gstreamer.SocketAddress;
import org.freedesktop.gstreamer.SocketConnection;
import com.sun.jna.Library;
import com.sun.jna.Pointer;

public interface GSocketConnectionAPI extends Library {
	GSocketConnectionAPI GSOCKETCONNECTION_API = GNative.loadLibrary("gio-2.0",  GSocketConnectionAPI.class, new HashMap<String, Object>() {{
        put(Library.OPTION_TYPE_MAPPER, new GTypeMapper());
    }});
	
	 SocketAddress g_socket_connection_get_local_address(SocketConnection connection, Pointer error);
	 Socket g_socket_connection_get_socket(SocketConnection connection);
}
