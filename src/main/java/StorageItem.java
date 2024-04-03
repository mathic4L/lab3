public enum StorageItem {

    TOOTHBRUSH("зубная щетка"),
    TOOTHPASTE("зубная паста"),
    TOWEL("полотенце"),
    HANDKERCHIEF("пол дюжены носовых плотков"),
    SOCKS("запасные носки"),
    NAILS("два старых гвоздя"),
    COPPERWIRE("кусок медной проволоки");

    final String name;
    StorageItem(String name) {
        this.name = name;
    }

}