package org.freedesktop.gstreamer.lowlevel;

import java.util.HashMap;

import org.freedesktop.gstreamer.SocketConnection;
import org.freedesktop.gstreamer.SocketService;
import org.freedesktop.gstreamer.lowlevel.annotations.CallerOwnsReturn;

import com.sun.jna.Library;
import com.sun.jna.Pointer;

public interface GSocketServiceAPI extends Library {
	GSocketServiceAPI GSOCKETSERVICE_API = GNative.loadLibrary("gio-2.0",  GSocketServiceAPI.class, new HashMap<String, Object>() {{
        put(Library.OPTION_TYPE_MAPPER, new GTypeMapper());
    }});
	
	@CallerOwnsReturn Pointer g_socket_service_new();
	void g_socket_service_start(SocketService s);
	void g_socket_servie_stop(SocketService s);
	boolean g_socket_listener_add_inet_port(SocketService listener, short port, Pointer sourceObject, Pointer error);
	SocketConnection g_socket_listener_accept(SocketService listener, Pointer sourceObject, Pointer cancellable, Pointer error);
}
