/**
 * DO NOT EDIT
 *
 * This file was automatically generated by
 *   https://github.com/Polymer/gen-typescript-declarations
 *
 * To modify these typings, edit the source file(s):
 *   marked-element.html
 */

/// <reference path="../polymer/types/polymer.d.ts" />
/// <reference path="marked-import.d.ts" />

/**
 * Element wrapper for the [marked](https://github.com/chjj/marked) library.
 *
 * `<marked-element>` accepts Markdown source and renders it to a child
 * element with the class `markdown-html`. This child element can be styled
 * as you would a normal DOM element. If you do not provide a child element
 * with the `markdown-html` class, the Markdown source will still be rendered,
 * but to a shadow DOM child that cannot be styled.
 *
 *
 * ### Markdown Content
 *
 * The Markdown source can be specified several ways:
 *
 * #### Use the `markdown` attribute to bind markdown
 *
 *     <marked-element markdown="`Markdown` is _awesome_!">
 *       <div slot="markdown-html"></div>
 *     </marked-element>
 *
 * #### Use `<script type="text/markdown">` element child to inline markdown
 *
 *     <marked-element>
 *       <div slot="markdown-html"></div>
 *       <script type="text/markdown">
 *         Check out my markdown!
 *
 *         We can even embed elements without fear of the HTML parser mucking up their
 *         textual representation:
 *
 *         ```html
 *         <awesome-sauce>
 *           <div>Oops, I'm about to forget to close this div.
 *         </awesome-sauce>
 *         ```
 *       </script>
 *     </marked-element>
 *
 * #### Use `<script type="text/markdown" src="URL">` element child to specify remote markdown
 *
 *     <marked-element>
 *       <div slot="markdown-html"></div>
 *       <script type="text/markdown" src="../guidelines.md"></script>
 *     </marked-element>
 *
 * Note that the `<script type="text/markdown">` approach is *static*. Changes to
 * the script content will *not* update the rendered markdown!
 *
 * Though, you can data bind to the `src` attribute to change the markdown.
 *
 * ```html
 * <marked-element>
 *   <div slot="markdown-html"></div>
 *   <script type="text/markdown" src$="[[source]]"></script>
 * </marked-element>
 * ...
 * <script>
 *   ...
 *   this.source = '../guidelines.md';
 * </script>
 * ```
 *
 * ### Styling
 * If you are using a child with the `markdown-html` class, you can style it
 * as you would a regular DOM element:
 *
 *     [slot="markdown-html"] p {
 *       color: red;
 *     }
 *
 *     [slot="markdown-html"] td:first-child {
 *       padding-left: 24px;
 *     }
 */
interface MarkedElementElement extends Polymer.Element {

    /**
     * The markdown source that should be rendered by this element.
     */
    markdown: string | null | undefined;

    /**
     * Enable GFM line breaks (regular newlines instead of two spaces for breaks)
     */
    breaks: boolean | null | undefined;

    /**
     * Conform to obscure parts of markdown.pl as much as possible. Don't fix any of the original markdown bugs or poor behavior.
     */
    pedantic: boolean | null | undefined;

    /**
     * Function used to customize a renderer based on the [API specified in the Marked
     * library](https://github.com/chjj/marked#overriding-renderer-methods).
     * It takes one argument: a marked renderer object, which is mutated by the function.
     */
    renderer: Function | null | undefined;

    /**
     * Sanitize the output. Ignore any HTML that has been input.
     */
    sanitize: boolean | null | undefined;

    /**
     * Function used to customize a sanitize behavior.
     * It takes one argument: element String without text Contents.
     *
     * e.g. `<div>` `<a href="/">` `</p>'.
     * Note: To enable this function, must set `sanitize` to true.
     * WARNING: If you are using this option to untrusted text, you must to prevent XSS Attacks.
     */
    sanitizer: Function | null | undefined;

    /**
     * If true, disables the default sanitization of any markdown received by
     * a request and allows fetched unsanitized markdown
     *
     * e.g. fetching markdown via `src` that has HTML.
     * Note: this value overrides `sanitize` if a request is made.
     */
    disableRemoteSanitization: boolean | null | undefined;

    /**
     * Use "smart" typographic punctuation for things like quotes and dashes.
     */
    smartypants: boolean | null | undefined;

    /**
     * Callback function invoked by Marked after HTML has been rendered.
     * It must take two arguments: err and text and must return the resulting text.
     */
    callback: Function | null | undefined;

    /**
     * A reference to the XMLHttpRequest instance used to generate the
     * network request.
     */
    readonly xhr: XMLHttpRequest | null;
    readonly outputElement: any;

    ready(): void;

    /**
     * Renders `markdown` to HTML when the element is attached.
     *
     * This serves a dual purpose:
     *
     *  * Prevents unnecessary work (no need to render when not visible).
     *
     *  * `attached` fires top-down, so we can give ancestors a chance to
     *    register listeners for the `syntax-highlight` event _before_ we render
     *    any markdown.
     */
    attached(): void;

    detached(): void;

    /**
     * Unindents the markdown source that will be rendered.
     */
    unindent(text: string): string;

    /**
     * Renders `markdown` into this element's DOM.
     *
     * This is automatically called whenever the `markdown` property is changed.
     *
     * The only case where you should be calling this is if you are providing
     * markdown via `<script type="text/markdown">` after this element has been
     * constructed (or updating that markdown).
     */
    render(): void;

    /**
     * Fired when the content is being processed and before it is rendered.
     * Provides an opportunity to highlight code blocks based on the programming language used. This
     * is also known as syntax highlighting. One example would be to use a prebuilt syntax
     * highlighting library, e.g with [highlightjs](https://highlightjs.org/).
     */
    _highlight(code: string, lang: string): string;

    _unindent(text: string): string;

    /**
     * Fired when the XHR finishes loading
     */
    _request(url: string): any;

    /**
     * Fired when an error is received while fetching remote markdown content.
     */
    _handleError(e: Event): void;

    _onScriptAttributeChanged(mutation: MutationRecord[]): void;
}

interface HTMLElementTagNameMap {
    "marked-element": MarkedElementElement;
}
