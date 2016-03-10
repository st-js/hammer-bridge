package org.stjs.bridge.hammerjs;

import static org.stjs.javascript.JSCollections.$array;

import org.stjs.javascript.Array;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.annotation.Template;
import org.stjs.javascript.dom.DOMEvent;
import org.stjs.javascript.dom.Element;
import org.stjs.javascript.functions.Callback1;
import org.stjs.javascript.functions.Function0;
import org.stjs.javascript.functions.Function1;

/**
 * @author Kirill Vergun
 * @since 06.04.15
 */
@STJSBridge
public class Hammer {
	private static class Direction {
	}

	public interface Recognizer {
		public void set(Object prop);
	}

	public static class RecognizerOptions {
		public boolean enable;
		public Direction direction;
		public int threshold;
		public int time;
		public double velocity;
	}

	public static class PresetArguments {
		private PresetArguments() {
		}
	}

	public static class Options {
		public String touchAction; // "compute"
		public boolean domEvents; // false
		public boolean enable; // true
		public Object cssProps;

		public boolean dragBlockVertical; // v1
		public boolean dragBlockHorizontal; // v1

		/**
		 * @see Hammer#makePreset(org.stjs.bridge.hammerjs.Hammer.Recognizer,
		 * org.stjs.bridge.hammerjs.Hammer.RecognizerOptions)
		 */
		public Array<Array<PresetArguments>> recognizers;
	}

	public abstract static class HammerEvent extends DOMEvent {
		public static class Point {
			public int x;
			public int y;
		}

		public abstract static class PointerEvent extends DOMEvent {
		}

		public abstract static class Gesture extends DOMEvent {
		}

		public String type;
		public int deltaX;
		public int deltaY;
		public int deltaTime;
		public double distance;
		public double angle;
		public double velocityX;
		public double velocityY;
		public Direction direction;
		public Direction offsetDirection;
		public double scale;
		public double rotation;
		public Point center;
		public DOMEvent srcEvent;
		public DOMEvent target;
		public String pointerType;
		public String eventType;
		public boolean isFirst;
		public boolean isFinal;
		public Array<PointerEvent> pointers;
		public Array<PointerEvent> changedPointers;
		public Function0 preventDefault;
	}

	public abstract static class JqueryHammerEvent extends HammerEvent {
		public HammerEvent gesture;
	}

	public Hammer(Element element) {
	}

	public Hammer(Element element, Options options) {
	}

	public Hammer on(String DOMEvent, Callback1<HammerEvent> callback) {
		return this;
	}

	public Hammer on(String DOMEvent, Function1<HammerEvent, Boolean> callback) {
		return this;
	}

	public Hammer off(String DOMEvent, Callback1<HammerEvent> callback) {
		return this;
	}

	public Hammer off(String DOMEvent) {
		return this;
	}

	public Recognizer get(String name) {
		return null;
	}

	@Template("array")
	public static Array<PresetArguments> makePreset(Recognizer recognizer, RecognizerOptions options) {
		return $array(new PresetArguments());
	}

	public static Recognizer Swipe;
	public static Recognizer Pan;
	public static Recognizer Tap;
	public static Recognizer Press;

	public static Direction DIRECTION_HORIZONTAL;
	public static Direction DIRECTION_VERTICAL;
	public static Direction DIRECTION_ALL;

	public static String VERSION;
}
