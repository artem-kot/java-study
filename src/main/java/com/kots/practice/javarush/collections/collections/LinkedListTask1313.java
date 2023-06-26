package com.kots.practice.javarush.collections.collections;

/**
 * The goal of this task is to implement a linked list for String values.
 * LinkedList is just like ArrayList, but each element has a link to the previous one and the next one.
 * first and last elements are "technical" nodes. First has only the link to the next.
 * Last has only the link to the previous. They don't have values.
 */

public class LinkedListTask1313 {
    private Node first = new Node();
    private Node last = new Node();

    public static void main(String[] args) {
        LinkedListTask1313 stringLinkedList = new LinkedListTask1313();
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
    }

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement) != null) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(String value) {
        Node node = new Node();
        if (first.next == null) {
            first.next = last;
            node.prev = last;
            last.value = value;
            last = node;
        } else {
            node.prev = last;
            last.prev.next = last;
            last.value = value;
            last = node;
        }
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}

