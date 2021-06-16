package com.company;

public interface MaskInventory {
   final int MASK_QUANTITY_PER_BOX=45;


   void addMaskBox(int addMaskBox);
   void takeMaskBox(int takeMaskBox );
   void takeMask();

   double calcRemainingMask();
   double calcRemainingMaskBox();

}
