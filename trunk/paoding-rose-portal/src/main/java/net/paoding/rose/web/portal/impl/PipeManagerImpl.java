/*
 * Copyright 2007-2010 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.paoding.rose.web.portal.impl;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import net.paoding.rose.web.Invocation;
import net.paoding.rose.web.portal.Window;

public class PipeManagerImpl implements PipeManager {

    @Override
    public Pipe getPipe(Invocation inv, boolean create) {

        return new Pipe() {
            
            @Override
            public void register(Window window) {
                // TODO Auto-generated method stub
                
            }

            private HttpServletResponse response;

            @Override
            public void setup() throws IOException {
                response.flushBuffer();
            }

            @Override
            public void await(long timeout) {

            }

            @Override
            public void fire(Window window) {
                //
            }

            @Override
            public void close() {
                // TODO Auto-generated method stub

            }

        };
    }

}