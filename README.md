# Recyclerview advance example
Uso de componentes para eliminar campos de la lista y usar los datachangue o item changues. 

### Elemento que nos ayuda a eliminar un item y refrescar la lista dentro del adapter
```java
public void remove(int position) {
    lstThreats.remove(position);
    notifyItemRemoved(position);
    notifyItemRangeChanged(position, lstThreats.size());
}
```

### Elemento que nos ayuda a refrescar los elementos de una lista
```java
notifyDataSetChanged();
```

### Para presentar un preview en diferente orientacion se muestra de la sig. manera
```java
<android.support.v7.widget.RecyclerView
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="horizontal"
    app:layoutManager="android.support.v7.widget.LinearLayoutManager"
    tools:listitem="@layout/item_detail_sp"
/>
```
