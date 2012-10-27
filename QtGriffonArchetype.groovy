/*
 * Copyright 2012 the original author or authors.
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

/**
 * @author Andres Almiray
 */
class QtGriffonArchetype {
    String version = '1.0.0'
    String griffonVersion = '1.1.0 > *'
    String license = 'Apache Software License 2.0'
    String documentation = ''
    String source = 'https://github.com/griffon/griffon-qt-archetype'
    List authors = [
        [
            name: 'Andres Almiray',
            email: 'aalmiray@yahoo.com'
        ]
    ]
    String title = 'Default archetype for Qt applications'
    String description = '''
Creates an application with Qt as the defualt UI toolkit.

Usage
----
Simply specify the name of the archetype (*qt*) when invoking the `create-app`
command, like this

    griffon create-app sample --archetype=qt

Configuration
-------------
There's no additional configuration required by this archetype.'
'''
}
