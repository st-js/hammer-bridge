Strongly-Typed Javascript (STJS) Bridge to HammerJS
================================

The STJS bridge to HammerJS gives you access to this great library using a Java syntax.


```java
new Hammer(cell).on(
    "touchstart touchend touchcancel touchleave touchmove dragstart drag dragstop", 
    ev -> {
        if (!that.isDragAllowed()) {
            ev.stopPropagation();
            return false;
        }
        return true;
    }
);
```
