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
    /// Спр пользов.
    /// </summary>
    // *** Start programmer edit section *** (СпрПользов CustomAttributes)

    // *** End programmer edit section *** (СпрПользов CustomAttributes)
    [AutoAltered()]
    [Caption("Справочник пользователи")]
    [AccessType(ICSSoft.STORMNET.AccessType.none)]
    [View("СпрПользовE", new string[] {
            "Код as \'Код\'",
            "ФИО as \'ФИО\'",
            "Должность as \'Должность\'"})]
    [View("СпрПользовL", new string[] {
            "Код as \'Код\'",
            "ФИО as \'ФИО\'",
            "Должность as \'Должность\'"})]
    public class СпрПользов : ICSSoft.STORMNET.DataObject
    {
        
        private string fФИО;
        
        private int fКод;
        
        private string fДолжность;
        
        // *** Start programmer edit section *** (СпрПользов CustomMembers)

        // *** End programmer edit section *** (СпрПользов CustomMembers)

        
        /// <summary>
        /// Должность.
        /// </summary>
        // *** Start programmer edit section *** (СпрПользов.Должность CustomAttributes)

        // *** End programmer edit section *** (СпрПользов.Должность CustomAttributes)
        [StrLen(255)]
        public virtual string Должность
        {
            get
            {
                // *** Start programmer edit section *** (СпрПользов.Должность Get start)

                // *** End programmer edit section *** (СпрПользов.Должность Get start)
                string result = this.fДолжность;
                // *** Start programmer edit section *** (СпрПользов.Должность Get end)

                // *** End programmer edit section *** (СпрПользов.Должность Get end)
                return result;
            }
            set
            {
                // *** Start programmer edit section *** (СпрПользов.Должность Set start)

                // *** End programmer edit section *** (СпрПользов.Должность Set start)
                this.fДолжность = value;
                // *** Start programmer edit section *** (СпрПользов.Должность Set end)

                // *** End programmer edit section *** (СпрПользов.Должность Set end)
            }
        }
        
        /// <summary>
        /// Код.
        /// </summary>
        // *** Start programmer edit section *** (СпрПользов.Код CustomAttributes)

        // *** End programmer edit section *** (СпрПользов.Код CustomAttributes)
        public virtual int Код
        {
            get
            {
                // *** Start programmer edit section *** (СпрПользов.Код Get start)

                // *** End programmer edit section *** (СпрПользов.Код Get start)
                int result = this.fКод;
                // *** Start programmer edit section *** (СпрПользов.Код Get end)

                // *** End programmer edit section *** (СпрПользов.Код Get end)
                return result;
            }
            set
            {
                // *** Start programmer edit section *** (СпрПользов.Код Set start)

                // *** End programmer edit section *** (СпрПользов.Код Set start)
                this.fКод = value;
                // *** Start programmer edit section *** (СпрПользов.Код Set end)

                // *** End programmer edit section *** (СпрПользов.Код Set end)
            }
        }
        
        /// <summary>
        /// ФИО.
        /// </summary>
        // *** Start programmer edit section *** (СпрПользов.ФИО CustomAttributes)

        // *** End programmer edit section *** (СпрПользов.ФИО CustomAttributes)
        [StrLen(255)]
        public virtual string ФИО
        {
            get
            {
                // *** Start programmer edit section *** (СпрПользов.ФИО Get start)

                // *** End programmer edit section *** (СпрПользов.ФИО Get start)
                string result = this.fФИО;
                // *** Start programmer edit section *** (СпрПользов.ФИО Get end)

                // *** End programmer edit section *** (СпрПользов.ФИО Get end)
                return result;
            }
            set
            {
                // *** Start programmer edit section *** (СпрПользов.ФИО Set start)

                // *** End programmer edit section *** (СпрПользов.ФИО Set start)
                this.fФИО = value;
                // *** Start programmer edit section *** (СпрПользов.ФИО Set end)

                // *** End programmer edit section *** (СпрПользов.ФИО Set end)
            }
        }
        
        /// <summary>
        /// Class views container.
        /// </summary>
        public class Views
        {
            
            /// <summary>
            /// "СпрПользовE" view.
            /// </summary>
            public static ICSSoft.STORMNET.View СпрПользовE
            {
                get
                {
                    return ICSSoft.STORMNET.Information.GetView("СпрПользовE", typeof(IIS.Prilozhenie_03.СпрПользов));
                }
            }
            
            /// <summary>
            /// "СпрПользовL" view.
            /// </summary>
            public static ICSSoft.STORMNET.View СпрПользовL
            {
                get
                {
                    return ICSSoft.STORMNET.Information.GetView("СпрПользовL", typeof(IIS.Prilozhenie_03.СпрПользов));
                }
            }
        }
    }
}
