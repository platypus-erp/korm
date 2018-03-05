declare namespace Polymer {

    class IronMeta {
        static types: { [type: string]: { [key: string]: any } };
        value: any;
        readonly list: any[] | undefined;

        constructor(options?: {
            type: string | null | undefined,
            key: string | null | undefined,
            value: any,
        });

        byKey(key: string): any;
    }
}
