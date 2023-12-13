﻿//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Runtime Version:4.0.30319.42000
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

namespace IIS.Prilozhenie_03
{
    using System;
    using System.Xml;
    using ICSSoft.STORMNET;
    
    
    // *** Start programmer edit section *** (Using statements)

    // *** End programmer edit section *** (Using statements)


    /// <summary>
    /// Факт выпол раб.
    /// </summary>
    // *** Start programmer edit section *** (ФактВыполРаб CustomAttributes)

    // *** End programmer edit section *** (ФактВыполРаб CustomAttributes)
    [AutoAltered()]
    [Caption("Факт выпол раб")]
    [AccessType(ICSSoft.STORMNET.AccessType.none)]
    [View("ФактВыполРабE", new string[] {
            "Номер as \'Номер\'",
            "Дата as \'Дата\'",
            "Время as \'Время\'",
            "СпрПользов as \'Пользователь\'",
            "СпрПользов.ФИО as \'Пользователь\'",
            "СпрКонтрАг as \'Контрагент\'",
            "СпрКонтрАг.Наименование as \'Контрагент\'",
            "СпрОбъектСтр as \'Объект строительства\'",
            "СпрОбъектСтр.Наименование as \'Объект строительства\'"})]
    [AssociatedDetailViewAttribute("ФактВыполРабE", "ТЧФактВыпР", "ТЧФактВыпРE", true, "", "Табличная Часть Фактическое выполнение работ", true, new string[] {
            ""})]
    [View("ФактВыполРабL", new string[] {
            "Номер as \'Номер\'",
            "Дата as \'Дата\'",
            "Время as \'Время\'",
            "СпрПользов.ФИО as \'Пользователь\'",
            "СпрКонтрАг.Наименование as \'Контрагент\'",
            "СпрОбъектСтр.Наименование as \'Объект строительства\'"})]
    public class ФактВыполРаб : ICSSoft.STORMNET.DataObject
    {
        
        private string fВремя;
        
        private System.DateTime fДата;
        
        private int fНомер;
        
        private IIS.Prilozhenie_03.СпрКонтрАг fСпрКонтрАг;
        
        private IIS.Prilozhenie_03.СпрПользов fСпрПользов;
        
        private IIS.Prilozhenie_03.СпрОбъектСтр fСпрОбъектСтр;
        
        private IIS.Prilozhenie_03.DetailArrayOfТЧФактВыпР fТЧФактВыпР;
        
        // *** Start programmer edit section *** (ФактВыполРаб CustomMembers)

        // *** End programmer edit section *** (ФактВыполРаб CustomMembers)

        
        /// <summary>
        /// Время.
        /// </summary>
        // *** Start programmer edit section *** (ФактВыполРаб.Время CustomAttributes)

        // *** End programmer edit section *** (ФактВыполРаб.Время CustomAttributes)
        [StrLen(255)]
        public virtual string Время
        {
            get
            {
                // *** Start programmer edit section *** (ФактВыполРаб.Время Get start)

                // *** End programmer edit section *** (ФактВыполРаб.Время Get start)
                string result = this.fВремя;
                // *** Start programmer edit section *** (ФактВыполРаб.Время Get end)

                // *** End programmer edit section *** (ФактВыполРаб.Время Get end)
                return result;
            }
            set
            {
                // *** Start programmer edit section *** (ФактВыполРаб.Время Set start)

                // *** End programmer edit section *** (ФактВыполРаб.Время Set start)
                this.fВремя = value;
                // *** Start programmer edit section *** (ФактВыполРаб.Время Set end)

                // *** End programmer edit section *** (ФактВыполРаб.Время Set end)
            }
        }
        
        /// <summary>
        /// Дата.
        /// </summary>
        // *** Start programmer edit section *** (ФактВыполРаб.Дата CustomAttributes)

        // *** End programmer edit section *** (ФактВыполРаб.Дата CustomAttributes)
        public virtual System.DateTime Дата
        {
            get
            {
                // *** Start programmer edit section *** (ФактВыполРаб.Дата Get start)

                // *** End programmer edit section *** (ФактВыполРаб.Дата Get start)
                System.DateTime result = this.fДата;
                // *** Start programmer edit section *** (ФактВыполРаб.Дата Get end)

                // *** End programmer edit section *** (ФактВыполРаб.Дата Get end)
                return result;
            }
            set
            {
                // *** Start programmer edit section *** (ФактВыполРаб.Дата Set start)

                // *** End programmer edit section *** (ФактВыполРаб.Дата Set start)
                this.fДата = value;
                // *** Start programmer edit section *** (ФактВыполРаб.Дата Set end)

                // *** End programmer edit section *** (ФактВыполРаб.Дата Set end)
            }
        }
        
        /// <summary>
        /// Номер.
        /// </summary>
        // *** Start programmer edit section *** (ФактВыполРаб.Номер CustomAttributes)

        // *** End programmer edit section *** (ФактВыполРаб.Номер CustomAttributes)
        public virtual int Номер
        {
            get
            {
                // *** Start programmer edit section *** (ФактВыполРаб.Номер Get start)

                // *** End programmer edit section *** (ФактВыполРаб.Номер Get start)
                int result = this.fНомер;
                // *** Start programmer edit section *** (ФактВыполРаб.Номер Get end)

                // *** End programmer edit section *** (ФактВыполРаб.Номер Get end)
                return result;
            }
            set
            {
                // *** Start programmer edit section *** (ФактВыполРаб.Номер Set start)

                // *** End programmer edit section *** (ФактВыполРаб.Номер Set start)
                this.fНомер = value;
                // *** Start programmer edit section *** (ФактВыполРаб.Номер Set end)

                // *** End programmer edit section *** (ФактВыполРаб.Номер Set end)
            }
        }
        
        /// <summary>
        /// Факт выпол раб.
        /// </summary>
        // *** Start programmer edit section *** (ФактВыполРаб.СпрКонтрАг CustomAttributes)

        // *** End programmer edit section *** (ФактВыполРаб.СпрКонтрАг CustomAttributes)
        [PropertyStorage(new string[] {
                "СпрКонтрАг"})]
        [NotNull()]
        public virtual IIS.Prilozhenie_03.СпрКонтрАг СпрКонтрАг
        {
            get
            {
                // *** Start programmer edit section *** (ФактВыполРаб.СпрКонтрАг Get start)

                // *** End programmer edit section *** (ФактВыполРаб.СпрКонтрАг Get start)
                IIS.Prilozhenie_03.СпрКонтрАг result = this.fСпрКонтрАг;
                // *** Start programmer edit section *** (ФактВыполРаб.СпрКонтрАг Get end)

                // *** End programmer edit section *** (ФактВыполРаб.СпрКонтрАг Get end)
                return result;
            }
            set
            {
                // *** Start programmer edit section *** (ФактВыполРаб.СпрКонтрАг Set start)

                // *** End programmer edit section *** (ФактВыполРаб.СпрКонтрАг Set start)
                this.fСпрКонтрАг = value;
                // *** Start programmer edit section *** (ФактВыполРаб.СпрКонтрАг Set end)

                // *** End programmer edit section *** (ФактВыполРаб.СпрКонтрАг Set end)
            }
        }
        
        /// <summary>
        /// Факт выпол раб.
        /// </summary>
        // *** Start programmer edit section *** (ФактВыполРаб.СпрОбъектСтр CustomAttributes)

        // *** End programmer edit section *** (ФактВыполРаб.СпрОбъектСтр CustomAttributes)
        [PropertyStorage(new string[] {
                "СпрОбъектСтр"})]
        [NotNull()]
        public virtual IIS.Prilozhenie_03.СпрОбъектСтр СпрОбъектСтр
        {
            get
            {
                // *** Start programmer edit section *** (ФактВыполРаб.СпрОбъектСтр Get start)

                // *** End programmer edit section *** (ФактВыполРаб.СпрОбъектСтр Get start)
                IIS.Prilozhenie_03.СпрОбъектСтр result = this.fСпрОбъектСтр;
                // *** Start programmer edit section *** (ФактВыполРаб.СпрОбъектСтр Get end)

                // *** End programmer edit section *** (ФактВыполРаб.СпрОбъектСтр Get end)
                return result;
            }
            set
            {
                // *** Start programmer edit section *** (ФактВыполРаб.СпрОбъектСтр Set start)

                // *** End programmer edit section *** (ФактВыполРаб.СпрОбъектСтр Set start)
                this.fСпрОбъектСтр = value;
                // *** Start programmer edit section *** (ФактВыполРаб.СпрОбъектСтр Set end)

                // *** End programmer edit section *** (ФактВыполРаб.СпрОбъектСтр Set end)
            }
        }
        
        /// <summary>
        /// Факт выпол раб.
        /// </summary>
        // *** Start programmer edit section *** (ФактВыполРаб.СпрПользов CustomAttributes)

        // *** End programmer edit section *** (ФактВыполРаб.СпрПользов CustomAttributes)
        [PropertyStorage(new string[] {
                "СпрПользов"})]
        [NotNull()]
        public virtual IIS.Prilozhenie_03.СпрПользов СпрПользов
        {
            get
            {
                // *** Start programmer edit section *** (ФактВыполРаб.СпрПользов Get start)

                // *** End programmer edit section *** (ФактВыполРаб.СпрПользов Get start)
                IIS.Prilozhenie_03.СпрПользов result = this.fСпрПользов;
                // *** Start programmer edit section *** (ФактВыполРаб.СпрПользов Get end)

                // *** End programmer edit section *** (ФактВыполРаб.СпрПользов Get end)
                return result;
            }
            set
            {
                // *** Start programmer edit section *** (ФактВыполРаб.СпрПользов Set start)

                // *** End programmer edit section *** (ФактВыполРаб.СпрПользов Set start)
                this.fСпрПользов = value;
                // *** Start programmer edit section *** (ФактВыполРаб.СпрПользов Set end)

                // *** End programmer edit section *** (ФактВыполРаб.СпрПользов Set end)
            }
        }
        
        /// <summary>
        /// Факт выпол раб.
        /// </summary>
        // *** Start programmer edit section *** (ФактВыполРаб.ТЧФактВыпР CustomAttributes)

        // *** End programmer edit section *** (ФактВыполРаб.ТЧФактВыпР CustomAttributes)
        public virtual IIS.Prilozhenie_03.DetailArrayOfТЧФактВыпР ТЧФактВыпР
        {
            get
            {
                // *** Start programmer edit section *** (ФактВыполРаб.ТЧФактВыпР Get start)

                // *** End programmer edit section *** (ФактВыполРаб.ТЧФактВыпР Get start)
                if ((this.fТЧФактВыпР == null))
                {
                    this.fТЧФактВыпР = new IIS.Prilozhenie_03.DetailArrayOfТЧФактВыпР(this);
                }
                IIS.Prilozhenie_03.DetailArrayOfТЧФактВыпР result = this.fТЧФактВыпР;
                // *** Start programmer edit section *** (ФактВыполРаб.ТЧФактВыпР Get end)

                // *** End programmer edit section *** (ФактВыполРаб.ТЧФактВыпР Get end)
                return result;
            }
            set
            {
                // *** Start programmer edit section *** (ФактВыполРаб.ТЧФактВыпР Set start)

                // *** End programmer edit section *** (ФактВыполРаб.ТЧФактВыпР Set start)
                this.fТЧФактВыпР = value;
                // *** Start programmer edit section *** (ФактВыполРаб.ТЧФактВыпР Set end)

                // *** End programmer edit section *** (ФактВыполРаб.ТЧФактВыпР Set end)
            }
        }
        
        /// <summary>
        /// Class views container.
        /// </summary>
        public class Views
        {
            
            /// <summary>
            /// "ФактВыполРабE" view.
            /// </summary>
            public static ICSSoft.STORMNET.View ФактВыполРабE
            {
                get
                {
                    return ICSSoft.STORMNET.Information.GetView("ФактВыполРабE", typeof(IIS.Prilozhenie_03.ФактВыполРаб));
                }
            }
            
            /// <summary>
            /// "ФактВыполРабL" view.
            /// </summary>
            public static ICSSoft.STORMNET.View ФактВыполРабL
            {
                get
                {
                    return ICSSoft.STORMNET.Information.GetView("ФактВыполРабL", typeof(IIS.Prilozhenie_03.ФактВыполРаб));
                }
            }
        }
    }
}
