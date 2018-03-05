/**
 * DO NOT EDIT
 *
 * This file was automatically generated by
 *   https://github.com/Polymer/gen-typescript-declarations
 *
 * To modify these typings, edit the source file(s):
 *   iron-button-state.html
 */

/// <reference path="../polymer/types/polymer.d.ts" />
/// <reference path="../iron-a11y-keys-behavior/iron-a11y-keys-behavior.d.ts" />
/// <reference path="iron-control-state.d.ts" />

declare namespace Polymer {

    interface IronButtonState extends Polymer.IronA11yKeysBehavior {
        keyBindings: object;

        /**
         * If true, the user is currently holding down the button.
         */
        readonly pressed: boolean | null | undefined;

        /**
         * If true, the button toggles the active state with each tap or press
         * of the spacebar.
         */
        toggles: boolean | null | undefined;

        /**
         * If true, the button is a toggle and is currently in the active state.
         */
        active: boolean | null | undefined;

        /**
         * True if the element is currently being pressed by a "pointer," which
         * is loosely defined as mouse or touch input (but specifically excluding
         * keyboard input).
         */
        readonly pointerDown: boolean | null | undefined;

        /**
         * True if the input device that caused the element to receive focus
         * was a keyboard.
         */
        readonly receivedFocusFromKeyboard: boolean | null | undefined;

        /**
         * The aria attribute to be set if the button is a toggle and in the
         * active state.
         */
        ariaActiveAttribute: string | null | undefined;
        _mouseEventRe: RegExp | null;

        _tapHandler(): void;

        _focusChanged(focused: any): void;

        _detectKeyboardFocus(focused: any): void;

        /**
         * 'change' events
         */
        _userActivate(active: any): void;

        _downHandler(event: any): void;

        _upHandler(): void;

        /**
         * @param event .
         */
        _spaceKeyDownHandler(event: KeyboardEvent): void;

        /**
         * @param event .
         */
        _spaceKeyUpHandler(event: KeyboardEvent): void;

        /**
         * event handler to unwind before triggering another event
         */
        _asyncClick(): void;

        _pressedChanged(pressed: any): void;

        _ariaActiveAttributeChanged(value: any, oldValue: any): void;

        _activeChanged(active: any, ariaActiveAttribute: any): void;

        _controlStateChanged(): void;

        _changedButtonState(): void;
    }

    const IronButtonState: object;
}
