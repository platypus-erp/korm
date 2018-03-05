/**
 * DO NOT EDIT
 *
 * This file was automatically generated by
 *   https://github.com/Polymer/gen-typescript-declarations
 *
 * To modify these typings, edit the source file(s):
 *   neon-animation-runner-behavior.html
 */

/// <reference path="../polymer/types/polymer.d.ts" />
/// <reference path="neon-animatable-behavior.d.ts" />

declare namespace Polymer {

    /**
     * `Polymer.NeonAnimationRunnerBehavior` adds a method to run animations.
     */
    interface NeonAnimationRunnerBehavior extends Polymer.NeonAnimatableBehavior {
        _configureAnimations(configs: any): any;

        _shouldComplete(activeEntries: any): any;

        _complete(activeEntries: any): void;

        /**
         * Plays an animation with an optional `type`.
         */
        playAnimation(type?: string, cookie?: object): void;

        /**
         * Cancels the currently running animations.
         */
        cancelAnimation(): void;
    }

    const NeonAnimationRunnerBehavior: object;
}
