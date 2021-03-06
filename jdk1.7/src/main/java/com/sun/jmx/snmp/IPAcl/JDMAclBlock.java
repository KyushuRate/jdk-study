/*
 * Copyright (c) 1997, 2007, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */


/* Generated By:JJTree: Do not edit this line. JDMAclBlock.java */

package com.sun.jmx.snmp.IPAcl;

import java.util.Hashtable;

class JDMAclBlock extends SimpleNode {
  JDMAclBlock(int id) {
    super(id);
  }

  JDMAclBlock(Parser p, int id) {
    super(p, id);
  }

  public static Node jjtCreate(int id) {
      return new JDMAclBlock(id);
  }

  public static Node jjtCreate(Parser p, int id) {
      return new JDMAclBlock(p, id);
  }

  /**
   * Do no need to go through this part of the tree for
   * building TrapEntry.
   */
   public void buildTrapEntries(Hashtable dest) {}

  /**
   * Do no need to go through this part of the tree for
   * building InformEntry.
   */
   public void buildInformEntries(Hashtable dest) {}
}
