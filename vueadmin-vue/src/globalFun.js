import Vue from "vue"

Vue.mixin({
    methods: {
        hasAuth(perm) {
            var authorities = this.$store.state.menus.permList

            return authorities.indexOf(perm) > -1
        }
    }
})