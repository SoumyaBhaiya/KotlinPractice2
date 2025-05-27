// Working with innter classes



fun main(){
    val listView = ListView(arrayOf("Name 1", "Name2", "Name3", "name4"))

    listView.ListViewItem().displayItem(2)
}



class ListView(val items: Array<String>){
    inner class ListViewItem(){
        fun displayItem(position:Int){
            println(items[position])
        }
    }
}