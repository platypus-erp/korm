/**
 * DO NOT EDIT
 *
 * This file was automatically generated by
 *   https://github.com/Polymer/gen-typescript-declarations
 *
 * To modify these typings, edit the source file(s):
 *   paper-inky-focus-behavior.html
 */

/// <reference path="../polymer/types/polymer.d.ts" />
/// <reference path="../iron-behaviors/iron-button-state.d.ts" />
/// <reference path="paper-ripple-behavior.d.ts" />

declare namespace Polymer {

    /**
     * `Polymer.PaperInkyFocusBehavior` implements a ripple when the element has keyboard focus.
     */
    interface PaperInkyFocusBehavior extends Polymer.IronButtonState, Polymer.IronControlState, Polymer.PaperRippleBehavior {
        _createRipple(): any;

        _focusedChanged(receivedFocusFromKeyboard: any): void;
    }

    const PaperInkyFocusBehavior: object;
}
