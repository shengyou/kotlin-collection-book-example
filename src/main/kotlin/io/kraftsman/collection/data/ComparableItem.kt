package io.kraftsman.collection.data

data class ComparableItem(
    val id: Int,
    val product: Product,
    val amount: Int
) : Comparable<ComparableItem> {
    override fun compareTo(other: ComparableItem): Int = when {
        this.amount != other.amount -> this.amount compareTo other.amount
        else -> 0
    }
}
