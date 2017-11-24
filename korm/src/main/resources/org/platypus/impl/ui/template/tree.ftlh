<#-- @ftlvariable name="view" type="org.platypus.impl.ui.tree.TreeViewApi" -->
<link rel="import" href="/bower_components/polymer/polymer-element.html">
<link rel="import" href="/bower_components/app-layout/app-toolbar/app-toolbar.html">
<link rel="import" href="/bower_components/iron-icons/iron-icons.html">
<link rel="import" href="/bower_components/vaadin-grid/vaadin-grid.html">
<link rel="import" href="/bower_components/vaadin-grid/vaadin-grid-selection-column.html">
<link rel="import" href="/bower_components/vaadin-material-theme/vaadin-grid.html">
<#list view.imports as import>
<link rel="import" href="/bower_components/${import}">
</#list>
<link rel="import" href="/src/shared-styles.html">

<dom-module id="platypus-${view.model.modelName}-tree">
    <template>
        <style include="shared-styles">
            :host {
                display: block;
                padding: 10px;
            }
            ${view.css}
        </style>
        <iron-ajax auto
                   url="http://127.0.0.1:8080/${view.model.modelName}/search"
                   handle-as="json"
                   last-response="{{data}}">
        </iron-ajax>

        <app-toolbar>
            <paper-icon-button icon="menu"></paper-icon-button>
            <div main-title>List of ${view.model.modelName}</div>
            <paper-icon-button icon="search"></paper-icon-button>
        </app-toolbar>
        <div>
            <vaadin-grid items="[[data.result]]" column-reordering-allowed multi-sort>

                <vaadin-grid-selection-column frozen></vaadin-grid-selection-column>

                <vaadin-grid-column width="50px" flex-grow="0">
                    <template class="header">#</template>
                    <template>[[index]]</template>
                </vaadin-grid-column>

                <#list view.view.fields as widget>
                    <vaadin-grid-column width="9em" resizable>
                        <template class="header">
                            <vaadin-grid-sorter path="${widget.prop.name}">${widget.prop.slots.label}</vaadin-grid-sorter>
                        </template>
                        <template>[[item.${widget.prop.name}]]</template>
                        <template class="footer">
                            <vaadin-grid-sorter path="${widget.prop.name}">${widget.prop.slots.label}</vaadin-grid-sorter>
                        </template>
                    </vaadin-grid-column>
                </#list>
            </vaadin-grid>
        </div>
    </template>

    <script>
        class Platpus${view.model.modelName?cap_first}Tree extends Polymer.Element {
            static get is() {
                return 'platypus-${view.model.modelName}-tree';
            }
        }
        window.customElements.define(Platpus${view.model.modelName?cap_first}Tree.is, Platpus${view.model.modelName?cap_first}Tree);
    </script>
</dom-module>
