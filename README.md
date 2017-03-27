# Recyclerview advance example
Uso de componentes para eliminar campos de la lista y usar los datachangue o item changues. 

##Elemento que nos ayuda a eliminar un item y refrescar la lista dentro del adapter
```java
public void remove(int position) {
    lstThreats.remove(position);
    notifyItemRemoved(position);
    notifyItemRangeChanged(position, lstThreats.size());
}
```
