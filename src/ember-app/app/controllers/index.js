import Controller from '@ember/controller';
import { computed } from '@ember/object';

export default Controller.extend({
  sitemap: computed('i18n.locale', function () {
    let i18n = this.get('i18n');

    return {
      nodes: [
        {
          link: 'index',
          icon: 'home',
          caption: i18n.t('forms.application.sitemap.index.caption'),
          title: i18n.t('forms.application.sitemap.index.title'),
          children: null
        }, {
          link: null,
          icon: 'list',
          caption: i18n.t('forms.application.sitemap.prilozhenie-03.caption'),
          title: i18n.t('forms.application.sitemap.prilozhenie-03.title'),
          children: [{
            link: 'i-i-s-prilozhenie-03-спр-ед-измер-l',
            caption: i18n.t('forms.application.sitemap.prilozhenie-03.i-i-s-prilozhenie-03-спр-ед-измер-l.caption'),
            title: i18n.t('forms.application.sitemap.prilozhenie-03.i-i-s-prilozhenie-03-спр-ед-измер-l.title'),
            icon: 'chart bar',
            children: null
          }, {
            link: 'i-i-s-prilozhenie-03-спр-контр-аг-l',
            caption: i18n.t('forms.application.sitemap.prilozhenie-03.i-i-s-prilozhenie-03-спр-контр-аг-l.caption'),
            title: i18n.t('forms.application.sitemap.prilozhenie-03.i-i-s-prilozhenie-03-спр-контр-аг-l.title'),
            icon: 'edit',
            children: null
          }, {
            link: 'i-i-s-prilozhenie-03-спр-номен-l',
            caption: i18n.t('forms.application.sitemap.prilozhenie-03.i-i-s-prilozhenie-03-спр-номен-l.caption'),
            title: i18n.t('forms.application.sitemap.prilozhenie-03.i-i-s-prilozhenie-03-спр-номен-l.title'),
            icon: 'table',
            children: null
          }, {
            link: 'i-i-s-prilozhenie-03-спр-трансп-ср-l',
            caption: i18n.t('forms.application.sitemap.prilozhenie-03.i-i-s-prilozhenie-03-спр-трансп-ср-l.caption'),
            title: i18n.t('forms.application.sitemap.prilozhenie-03.i-i-s-prilozhenie-03-спр-трансп-ср-l.title'),
            icon: 'folder',
            children: null
          }, {
            link: 'i-i-s-prilozhenie-03-спр-объект-стр-l',
            caption: i18n.t('forms.application.sitemap.prilozhenie-03.i-i-s-prilozhenie-03-спр-объект-стр-l.caption'),
            title: i18n.t('forms.application.sitemap.prilozhenie-03.i-i-s-prilozhenie-03-спр-объект-стр-l.title'),
            icon: 'briefcase',
            children: null
          }, {
            link: 'i-i-s-prilozhenie-03-спр-тип-транс-ср-l',
            caption: i18n.t('forms.application.sitemap.prilozhenie-03.i-i-s-prilozhenie-03-спр-тип-транс-ср-l.caption'),
            title: i18n.t('forms.application.sitemap.prilozhenie-03.i-i-s-prilozhenie-03-спр-тип-транс-ср-l.title'),
            icon: 'paperclip',
            children: null
          }, {
            link: 'i-i-s-prilozhenie-03-спр-виды-раб-l',
            caption: i18n.t('forms.application.sitemap.prilozhenie-03.i-i-s-prilozhenie-03-спр-виды-раб-l.caption'),
            title: i18n.t('forms.application.sitemap.prilozhenie-03.i-i-s-prilozhenie-03-спр-виды-раб-l.title'),
            icon: 'list',
            children: null
          }, {
            link: 'i-i-s-prilozhenie-03-спр-пользов-l',
            caption: i18n.t('forms.application.sitemap.prilozhenie-03.i-i-s-prilozhenie-03-спр-пользов-l.caption'),
            title: i18n.t('forms.application.sitemap.prilozhenie-03.i-i-s-prilozhenie-03-спр-пользов-l.title'),
            icon: 'folder',
            children: null
          }]
        }
      ]
    };
  }),
})