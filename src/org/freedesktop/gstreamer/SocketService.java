package org.freedesktop.gstreamer;

import java.util.function.Function;

import org.freedesktop.gstreamer.lowlevel.GSocketServiceAPI;

public class SocketService extends GObject {
	
	public static final String GTYPE_NAME = "GSocketService";
	private static GSocketServiceAPI gio = GSocketServiceAPI.GSOCKETSERVICE_API;
	public Function<SocketConnection, Boolean> incomingCallback;
	
	public SocketService(Initializer init) {
		super(init);
	}
	
	public SocketService() {
		this(initializer(gio.g_socket_service_new()));
	}
	
	public boolean addPort(int port) {
		return gio.g_socket_listener_add_inet_port(this, (short) port, null, null);
	}
	
	public SocketConnection accept() {
		return gio.g_socket_listener_accept(this, null, null, null);
	}
	
	public void start() {
		gio.g_socket_service_start(this);
		final SocketService ss = this;
		new Thread() {  // HACK because signal wasn't working
			public void run() {
				while (true) {
					SocketConnection c = ss.accept();
					if (ss.incomingCallback != null) {
						ss.incomingCallback.apply(c);
					}
				}
			}
		}.start();
	}
	
	public Object onIncoming(final Function<SocketConnection, Boolean> callback) {
		this.incomingCallback = callback;
		
		/*
		this.lessStupidConnect("incoming", new GstAPI.GstCallback() {
            @SuppressWarnings("unused")
            public boolean callback(SocketService service, SocketConnection connection, Pointer sourceObject, Pointer userData) {
            	System.out.println("callback");
            	return callback.apply(connection);
            }
		});
				*/
		
		
		return null;

	}
}
