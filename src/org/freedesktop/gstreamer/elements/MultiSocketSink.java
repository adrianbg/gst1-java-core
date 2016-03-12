/*
 * Copyright (c) 2015 Neil C Smith
 * Copyright (c) 2009 Levente Farkas
 * Copyright (c) 2009 Wayne Meissner
 * Copyright (c) 2008 Wayne Meissner
 * Copyright (C) 2007 David Schleef <ds@schleef.org>
 *           (C) 2008 Wim Taymans <wim.taymans@gmail.com>
 *
 * This file is part of gstreamer-java.
 *
 * This code is free software: you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License version 3 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License
 * version 3 for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * version 3 along with this work.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.freedesktop.gstreamer.elements;

import org.freedesktop.gstreamer.Socket;
import org.freedesktop.gstreamer.lowlevel.TcpAPI;

import com.sun.jna.Pointer;

/**
 * A sink {@link org.freedesktop.gstreamer.Element} that enables an application to pull data
 * from a pipeline.
 */
public class MultiSocketSink extends BaseSink {
    public static final String GST_NAME = "multisocketsink";
    public static final String GTYPE_NAME = "GstMultiSocketSink";

    private static final TcpAPI gst() { return TcpAPI.TCP_API; }
    
    public MultiSocketSink(Pointer p) {
    	super(initializer(p));
    }

    public MultiSocketSink(Initializer init) {
        super(init);
    }
    
    public MultiSocketSink(String name) {
    	this(makeRawElement(GST_NAME, name));
    }
    
    public MultiSocketSink() {
    	this((String)null);
    }
    
    public void add(Socket socket) {
    	this.emit("add", socket);
    }
}
