package dev.alexjf.homegrown.block.enums;

import net.minecraft.util.StringRepresentable;
 
public enum Dormant implements StringRepresentable {
   TRUE,
   FALSE;

   public String toString() {
      return this.getSerializedName();
   }
 
   public String getSerializedName() {
      return this == TRUE ? "true" : "false";
   }
}
 