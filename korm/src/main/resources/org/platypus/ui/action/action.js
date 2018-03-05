class CLASS_NAME extends Polymer.Element {
    static get is() {
        return 'ELEMENT_NAME';
    }

    static get properties() {
        return {
            pageType: {
                type: String,
                reflectToAttribute: true,
                observer: '_pageChanged',
            },
            uiAction: {
                type: Object,
                reflectToAttribute: true,
                observer: '_actionChanged'
            },
        }
    }

    _pageChanged(page) {
        console.log(page)
    }

    type_tree_clk() {
        this.pageType = 'tree'
    }

    type_form_clk() {
        this.pageType = 'form'
    }

    type_pivot_clk() {
        console.log(this);
    }

    type_kanban_clk() {
        console.log(this);
    }

    type_calendar_clk() {
        console.log(this);
    }

    type_timeline_clk() {
        console.log(this);
    }

    showType() {
        this.$.pageTypeSelector.classList.remove("hided");
        this.$.pageTypeSelector.classList.add("showed");
    }

    hideType() {
        this.$.pageTypeSelector.classList.remove("showed");
        this.$.pageTypeSelector.classList.add("hided");
    }
}