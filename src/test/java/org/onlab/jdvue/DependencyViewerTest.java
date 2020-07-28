/*
 * Copyright 2015-present Open Networking Laboratory
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.onlab.jdvue;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Unit test for the dependency viewer.
 *
 * @author Thomas Vachuska
 */
public class DependencyViewerTest {

    private class Fixture extends AbstractReportGenerator {
    }

    private final Fixture fixture = new Fixture();

    @Test
    public void basics() throws IOException {
        DependencyViewer.main(new String[]{"src/test/resources/catalog"});

        String expected = fixture.slurp(new FileInputStream("src/test/resources/expected.html"));
        String actual = fixture.slurp(new FileInputStream("src/test/resources/catalog.html"));

        // FIXME: add more manageable assertions here
//        assertEquals("incorrect html", expected, actual);
    }

}
