package io.kraftsman.collection.data

data class OrderItem(val id: Int, val product: Product, val amount: Int) : Comparable<OrderItem> {
    override fun compareTo(other: OrderItem): Int = when {
        this.amount != other.amount -> this.amount compareTo other.amount
        else -> 0
    }
}
