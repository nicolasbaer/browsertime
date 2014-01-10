/*******************************************************************************************************************************
 * It's Browser Time!
 * 
 * 
 * Copyright (C) 2013 by Tobias Lidskog (https://twitter.com/tobiaslidskog) & Peter Hedenskog
 * (http://peterhedenskog.com)
 * 
 ******************************************************************************************************************************** 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 * 
 ******************************************************************************************************************************** 
 */
package net.browsertime.tool.timings;

import net.browsertime.tool.serializer.XmlSerializer;

import javax.xml.bind.annotation.XmlAccessOrder;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 *
 */
@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
public class TimingMark {
  private final String name;
  private final double startTime;

  public TimingMark(String name, double startTime) {
    this.name = name;
    this.startTime = startTime;
  }

  @XmlAttribute
  public String getName() {
    return name;
  }

  @XmlAttribute
  @XmlJavaTypeAdapter(XmlSerializer.NonScientificDoubleAdapter.class)
  public Double getStartTime() {
    return startTime;
  }

  @SuppressWarnings("UnusedDeclaration")
  private TimingMark() {
    name = null;
    startTime = 0;
  }
}
