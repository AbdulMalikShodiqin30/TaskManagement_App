package com.D121201005.todoapp.fragments.list.adapter

import androidx.recyclerview.widget.DiffUtil
import com.D121201005.todoapp.data.models.ToDoData

class ToDoDiffUtil(
	private val oldList: List<ToDoData>,
	private val newList: List<ToDoData>
): DiffUtil.Callback() {
	override fun getOldListSize() = oldList.size

	override fun getNewListSize() = newList.size

	override fun areItemsTheSame(
		oldItemPosition: Int,
		newItemPosition: Int
	) = oldList[oldItemPosition] === newList[newItemPosition]

	override fun areContentsTheSame(
		oldItemPosition: Int,
		newItemPosition: Int
	) = oldList[oldItemPosition] == newList[newItemPosition]
}