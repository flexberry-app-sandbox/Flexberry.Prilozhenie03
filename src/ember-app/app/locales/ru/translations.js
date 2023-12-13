import $ from 'jquery';
import EmberFlexberryTranslations from 'ember-flexberry/locales/ru/translations';

import IISPrilozhenie_03ПользователиLForm from './forms/i-i-s-prilozhenie-03-пользователи-l';
import IISPrilozhenie_03СпрВидыРабLForm from './forms/i-i-s-prilozhenie-03-спр-виды-раб-l';
import IISPrilozhenie_03СпрЕдИзмерLForm from './forms/i-i-s-prilozhenie-03-спр-ед-измер-l';
import IISPrilozhenie_03СпрКонтрАгLForm from './forms/i-i-s-prilozhenie-03-спр-контр-аг-l';
import IISPrilozhenie_03СпрНоменLForm from './forms/i-i-s-prilozhenie-03-спр-номен-l';
import IISPrilozhenie_03СпрОбъектСтрLForm from './forms/i-i-s-prilozhenie-03-спр-объект-стр-l';
import IISPrilozhenie_03СпрПользовLForm from './forms/i-i-s-prilozhenie-03-спр-пользов-l';
import IISPrilozhenie_03СпрТипТрансСрLForm from './forms/i-i-s-prilozhenie-03-спр-тип-транс-ср-l';
import IISPrilozhenie_03СпрТранспСрLForm from './forms/i-i-s-prilozhenie-03-спр-трансп-ср-l';
import IISPrilozhenie_03ПользователиEForm from './forms/i-i-s-prilozhenie-03-пользователи-e';
import IISPrilozhenie_03СпрВидыРабEForm from './forms/i-i-s-prilozhenie-03-спр-виды-раб-e';
import IISPrilozhenie_03СпрЕдИзмерEForm from './forms/i-i-s-prilozhenie-03-спр-ед-измер-e';
import IISPrilozhenie_03СпрКонтрАгEForm from './forms/i-i-s-prilozhenie-03-спр-контр-аг-e';
import IISPrilozhenie_03СпрНоменEForm from './forms/i-i-s-prilozhenie-03-спр-номен-e';
import IISPrilozhenie_03СпрОбъектСтрEForm from './forms/i-i-s-prilozhenie-03-спр-объект-стр-e';
import IISPrilozhenie_03СпрПользовEForm from './forms/i-i-s-prilozhenie-03-спр-пользов-e';
import IISPrilozhenie_03СпрТипТрансСрEForm from './forms/i-i-s-prilozhenie-03-спр-тип-транс-ср-e';
import IISPrilozhenie_03СпрТранспСрEForm from './forms/i-i-s-prilozhenie-03-спр-трансп-ср-e';
import IISPrilozhenie_03СпрВидыРабModel from './models/i-i-s-prilozhenie-03-спр-виды-раб';
import IISPrilozhenie_03СпрЕдИзмерModel from './models/i-i-s-prilozhenie-03-спр-ед-измер';
import IISPrilozhenie_03СпрКонтрАгModel from './models/i-i-s-prilozhenie-03-спр-контр-аг';
import IISPrilozhenie_03СпрНоменModel from './models/i-i-s-prilozhenie-03-спр-номен';
import IISPrilozhenie_03СпрОбъектСтрModel from './models/i-i-s-prilozhenie-03-спр-объект-стр';
import IISPrilozhenie_03СпрПользовModel from './models/i-i-s-prilozhenie-03-спр-пользов';
import IISPrilozhenie_03СпрТипТрансСрModel from './models/i-i-s-prilozhenie-03-спр-тип-транс-ср';
import IISPrilozhenie_03СпрТранспСрModel from './models/i-i-s-prilozhenie-03-спр-трансп-ср';

const translations = {};
$.extend(true, translations, EmberFlexberryTranslations);

$.extend(true, translations, {
  models: {
    'i-i-s-prilozhenie-03-спр-виды-раб': IISPrilozhenie_03СпрВидыРабModel,
    'i-i-s-prilozhenie-03-спр-ед-измер': IISPrilozhenie_03СпрЕдИзмерModel,
    'i-i-s-prilozhenie-03-спр-контр-аг': IISPrilozhenie_03СпрКонтрАгModel,
    'i-i-s-prilozhenie-03-спр-номен': IISPrilozhenie_03СпрНоменModel,
    'i-i-s-prilozhenie-03-спр-объект-стр': IISPrilozhenie_03СпрОбъектСтрModel,
    'i-i-s-prilozhenie-03-спр-пользов': IISPrilozhenie_03СпрПользовModel,
    'i-i-s-prilozhenie-03-спр-тип-транс-ср': IISPrilozhenie_03СпрТипТрансСрModel,
    'i-i-s-prilozhenie-03-спр-трансп-ср': IISPrilozhenie_03СпрТранспСрModel
  },

  'application-name': 'Prilozhenie_03',

  forms: {
    loading: {
      'spinner-caption': 'Данные загружаются, пожалуйста подождите...'
    },
    index: {
      greeting: 'Добро пожаловать на тестовый стенд ember-flexberry!'
    },

    application: {
      header: {
        menu: {
          'sitemap-button': {
            title: 'Меню'
          },
          'user-settings-service-checkbox': {
            caption: 'Использовать сервис сохранения пользовательских настроек'
          },
          'show-menu': {
            caption: 'Показать меню'
          },
          'hide-menu': {
            caption: 'Скрыть меню'
          },
          'language-dropdown': {
            caption: 'Язык приложения',
            placeholder: 'Выберите язык'
          }
        },
        login: {
          caption: 'Вход'
        },
        logout: {
          caption: 'Выход'
        }
      },

      footer: {
        'application-name': 'Prilozhenie_03',
        'application-version': {
          caption: 'Версия аддона {{version}}',
          title: 'Это версия аддона ember-flexberry, которая сейчас используется в этом тестовом приложении ' +
          '(версия npm-пакета + хэш коммита). ' +
          'Кликните, чтобы перейти на GitHub.'
        }
      },

      sitemap: {
        'application-name': {
          caption: 'Prilozhenie_03',
          title: 'Prilozhenie_03'
        },
        'application-version': {
          caption: 'Версия аддона {{version}}',
          title: 'Это версия аддона ember-flexberry, которая сейчас используется в этом тестовом приложении ' +
          '(версия npm-пакета + хэш коммита). ' +
          'Кликните, чтобы перейти на GitHub.'
        },
        index: {
          caption: 'Главная',
          title: ''
        },
        'prilozhenie-03': {
          caption: 'Prilozhenie_03',
          title: 'Prilozhenie_03',
          'i-i-s-prilozhenie-03-спр-ед-измер-l': {
            caption: 'Справочник единицы измерения',
            title: ''
          },
          'i-i-s-prilozhenie-03-спр-контр-аг-l': {
            caption: 'Справочник контрагенты',
            title: ''
          },
          'i-i-s-prilozhenie-03-спр-номен-l': {
            caption: 'Справочник номенклатура',
            title: ''
          },
          'i-i-s-prilozhenie-03-спр-трансп-ср-l': {
            caption: 'Справочник транспортные средства',
            title: ''
          },
          'i-i-s-prilozhenie-03-спр-объект-стр-l': {
            caption: 'Справочник объект строительства',
            title: ''
          },
          'i-i-s-prilozhenie-03-спр-тип-транс-ср-l': {
            caption: 'Справочник тип транспортного средства',
            title: ''
          },
          'i-i-s-prilozhenie-03-спр-виды-раб-l': {
            caption: 'Справочник виды работ',
            title: ''
          },
          'i-i-s-prilozhenie-03-спр-пользов-l': {
            caption: 'Справочник пользователи',
            title: ''
          }
        }
      }
    },

    'edit-form': {
      'save-success-message-caption': 'Сохранение завершилось успешно',
      'save-success-message': 'Объект сохранен',
      'save-error-message-caption': 'Ошибка сохранения',
      'delete-success-message-caption': 'Удаление завершилось успешно',
      'delete-success-message': 'Объект удален',
      'delete-error-message-caption': 'Ошибка удаления'
    },
    'i-i-s-prilozhenie-03-пользователи-l': IISPrilozhenie_03ПользователиLForm,
    'i-i-s-prilozhenie-03-спр-виды-раб-l': IISPrilozhenie_03СпрВидыРабLForm,
    'i-i-s-prilozhenie-03-спр-ед-измер-l': IISPrilozhenie_03СпрЕдИзмерLForm,
    'i-i-s-prilozhenie-03-спр-контр-аг-l': IISPrilozhenie_03СпрКонтрАгLForm,
    'i-i-s-prilozhenie-03-спр-номен-l': IISPrilozhenie_03СпрНоменLForm,
    'i-i-s-prilozhenie-03-спр-объект-стр-l': IISPrilozhenie_03СпрОбъектСтрLForm,
    'i-i-s-prilozhenie-03-спр-пользов-l': IISPrilozhenie_03СпрПользовLForm,
    'i-i-s-prilozhenie-03-спр-тип-транс-ср-l': IISPrilozhenie_03СпрТипТрансСрLForm,
    'i-i-s-prilozhenie-03-спр-трансп-ср-l': IISPrilozhenie_03СпрТранспСрLForm,
    'i-i-s-prilozhenie-03-пользователи-e': IISPrilozhenie_03ПользователиEForm,
    'i-i-s-prilozhenie-03-спр-виды-раб-e': IISPrilozhenie_03СпрВидыРабEForm,
    'i-i-s-prilozhenie-03-спр-ед-измер-e': IISPrilozhenie_03СпрЕдИзмерEForm,
    'i-i-s-prilozhenie-03-спр-контр-аг-e': IISPrilozhenie_03СпрКонтрАгEForm,
    'i-i-s-prilozhenie-03-спр-номен-e': IISPrilozhenie_03СпрНоменEForm,
    'i-i-s-prilozhenie-03-спр-объект-стр-e': IISPrilozhenie_03СпрОбъектСтрEForm,
    'i-i-s-prilozhenie-03-спр-пользов-e': IISPrilozhenie_03СпрПользовEForm,
    'i-i-s-prilozhenie-03-спр-тип-транс-ср-e': IISPrilozhenie_03СпрТипТрансСрEForm,
    'i-i-s-prilozhenie-03-спр-трансп-ср-e': IISPrilozhenie_03СпрТранспСрEForm
  },

});

export default translations;
