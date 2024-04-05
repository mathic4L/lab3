package classes;

import java.util.Objects;

public enum StorageItem {

    TOOTHBRUSH("зубная щетка"),
    TOOTHPASTE("зубная паста"),
    TOWEL("полотенце"),
    HANDKERCHIEF("пол дюжены носовых плотков"),
    SOCKS("запасные носки"),
    NAILS("два старых гвоздя"),
    COPPERWIRE("кусок медной проволоки");

    private final String name;

    StorageItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}