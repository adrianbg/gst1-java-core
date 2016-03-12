package org.freedesktop.gstreamer;

import org.freedesktop.gstreamer.lowlevel.GSocketConnectionAPI;
import com.sun.jna.Pointer;

public class SocketConnection extends GObject {
	
	public static final String GTYPE_NAME = "GSocketConnection";
	private static GSocketConnectionAPI gio = GSocketConnectionAPI.GSOCKETCONNECTION_API;
	
	public SocketConnection(Initializer init) {
		super(init);
	}
	
	public SocketConnection(Pointer p) {
		this(initializer(p));
	}
	
	public SocketAddress getLocalAddress() {
		return gio.g_socket_connection_get_local_address(this, null);
	}
	
	public Socket getSocket() {
		return gio.g_socket_connection_get_socket(this);
	}
}
