package com.assignment.generics;

public class RandomValues<K,V> {
   K[] keys;
   V[] values;
   
   RandomValues(K[] keys, V[] values){
	   this.keys = keys;
	   this.values = values;
   }
   
//   public K[] getKeys() {
//	   return keys;
//   }
//   
//   public V[] getValues() {
//	   return values;
//   }
}
