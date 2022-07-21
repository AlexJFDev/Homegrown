package dev.alexjf.homegrown.block.enums;

import net.minecraft.util.StringIdentifiable;
 
public enum Dormant implements StringIdentifiable {
   TRUE,
   FALSE;

   public String toString() {
      return this.asString();
   }
 
   public String asString() {
      return this == TRUE ? "true" : "false";
   }
}
 