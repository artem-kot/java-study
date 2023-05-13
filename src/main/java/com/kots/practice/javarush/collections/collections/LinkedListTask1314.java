package com.kots.practice.javarush.collections.collections;

/**
 * The goal of this task is to show how tedious it is to fetch an element from LinkedList.
 * We have to implement a get(int index) method, which should return value of the object specified via
 * index argument.
 */

public class LinkedListTask1314 {
    private Node first = new Node();
    private Node last = new Node();

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement) != null) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

//    public void add(String value) {
//        Node node = new Node();
//        if (first.next == null) {
//            first.next = last;
//            node.prev = last;
//            last.value = value;
//            last = node;
//        } else {
//            node.prev = last;
//            last.prev.next = last;
//            last.value = value;
//            last = node;
//        }
//    }

    public void add(String value) {
        if (first.next == null) {
            Node node = new Node();
            node.value = value;
            first.next = node;
        }
        if (last.prev == null) {
            last.prev = first.next;
            return;
        }

        Node node = new Node();
        node.value = value;

        Node lastNode = last.prev;
        lastNode.next = node;
        node.prev = lastNode;
        last.prev = node;
    }

//    edge cases: index -1, index 0, index 1
    public String get(int index) {
        Node node = first.next;
        while (node.next != null && index > 0) {
            node = node.next;
            index--;
        }
        return index != 0 ? null : node.value;
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }


    public static void main(String[] args) {
        LinkedListTask1314 stringLinkedList = new LinkedListTask1314();
        stringLinkedList.add("1");
        stringLinkedList.add("2");
        stringLinkedList.add("3");
        stringLinkedList.add("4");
        stringLinkedList.add("5");
        stringLinkedList.add("6");
        stringLinkedList.add("7");
        stringLinkedList.add("8");
        stringLinkedList.add("9");
        stringLinkedList.printAll();

        System.out.println(stringLinkedList.get(-1));
        System.out.println(stringLinkedList.get(0));
        System.out.println(stringLinkedList.get(1));
        System.out.println(stringLinkedList.get(20));
    }
}

