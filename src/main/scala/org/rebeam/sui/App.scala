package org.rebeam.sui

import org.scalajs.dom.console

import slinky.core._
import slinky.core.annotations.react
import slinky.core.facade.Hooks._
import slinky.web.html._

import typings.reactLib.ScalableSlinky._
import typings.reactLib.reactMod.{FormEvent, MouseEvent}
import typings.antdLib.esNotificationMod.^.{default => Notification}

import typings.semanticDashUiDashReactLib.{
  semanticDashUiDashReactLibStrings => SuiStrings
}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import typings.semanticDashUiDashReactLib.semanticDashUiDashReactLibProps

@JSImport("resources/App.css", JSImport.Default)
@js.native
object AppCSS extends js.Object

@JSImport("semantic-ui-css/semantic.min.css", JSImport.Default)
@js.native
object SUICSS extends js.Any

@JSImport("antd/dist/antd.css", JSImport.Default)
@js.native
object CSS extends js.Any

@JSImport("resources/logo.svg", JSImport.Default)
@js.native
object ReactLogo extends js.Object

/**
  * This wraps most of `semantic-ui-react` in a more slinky friendly way. We cast all components into `ExternalComponent`s, and
  * export all available component props object creators as well
  */
object SuiFacade extends semanticDashUiDashReactLibProps {
  import typings.semanticDashUiDashReactLib.{
    semanticDashUiDashReactLibComponents => Sui, 
    semanticDashUiDashReactLibStrings => SuiStrings
  }

  @inline def Accordion:                  ExternalComponentP[AccordionProps]                = importSTComponent(Sui.Accordion)
  @inline def AccordionAccordion:         ExternalComponentP[AccordionAccordionProps]       = importSTComponent(Sui.AccordionAccordion)
  @inline def AccordionContent:           ExternalComponentP[AccordionContentProps]         = importSTComponent(Sui.AccordionContent)
  @inline def AccordionPanel:             ExternalComponentP[AccordionPanelProps]           = importSTComponent(Sui.AccordionPanel)
  @inline def AccordionTitle:             ExternalComponentP[AccordionTitleProps]           = importSTComponent(Sui.AccordionTitle)
  @inline def Advertisement:              ExternalComponentP[AdvertisementProps]            = importSTComponent(Sui.Advertisement)
  @inline def Breadcrumb:                 ExternalComponentP[BreadcrumbProps]               = importSTComponent(Sui.Breadcrumb)
  @inline def BreadcrumbDivider:          ExternalComponentP[BreadcrumbDividerProps]        = importSTComponent(Sui.BreadcrumbDivider)
  @inline def BreadcrumbSection:          ExternalComponentP[BreadcrumbSectionProps]        = importSTComponent(Sui.BreadcrumbSection)
  @inline def Button:                     ExternalComponentP[ButtonProps]                   = importSTComponent(Sui.Button)
  @inline def ButtonContent:              ExternalComponentP[ButtonContentProps]            = importSTComponent(Sui.ButtonContent)
  @inline def ButtonGroup:                ExternalComponentP[ButtonGroupProps]              = importSTComponent(Sui.ButtonGroup)
  @inline def ButtonOr:                   ExternalComponentP[ButtonOrProps]                 = importSTComponent(Sui.ButtonOr)
  @inline def Card:                       ExternalComponentP[CardProps]                     = importSTComponent(Sui.Card)
  @inline def CardContent:                ExternalComponentP[CardContentProps]              = importSTComponent(Sui.CardContent)
  @inline def CardDescription:            ExternalComponentP[CardDescriptionProps]          = importSTComponent(Sui.CardDescription)
  @inline def CardGroup:                  ExternalComponentP[CardGroupProps]                = importSTComponent(Sui.CardGroup)
  @inline def CardHeader:                 ExternalComponentP[CardHeaderProps]               = importSTComponent(Sui.CardHeader)
  @inline def CardMeta:                   ExternalComponentP[CardMetaProps]                 = importSTComponent(Sui.CardMeta)
  @inline def Checkbox:                   ExternalComponentP[CheckboxProps]                 = importSTComponent(Sui.Checkbox)
  @inline def Comment:                    ExternalComponentP[CommentProps]                  = importSTComponent(Sui.Comment)
  @inline def CommentAction:              ExternalComponentP[CommentActionProps]            = importSTComponent(Sui.CommentAction)
  @inline def CommentActions:             ExternalComponentP[CommentActionsProps]           = importSTComponent(Sui.CommentActions)
  @inline def CommentAuthor:              ExternalComponentP[CommentAuthorProps]            = importSTComponent(Sui.CommentAuthor)
  @inline def CommentAvatar:              ExternalComponentP[CommentAvatarProps]            = importSTComponent(Sui.CommentAvatar)
  @inline def CommentContent:             ExternalComponentP[CommentContentProps]           = importSTComponent(Sui.CommentContent)
  @inline def CommentGroup:               ExternalComponentP[CommentGroupProps]             = importSTComponent(Sui.CommentGroup)
  @inline def CommentMetadata:            ExternalComponentP[CommentMetadataProps]          = importSTComponent(Sui.CommentMetadata)
  @inline def CommentText:                ExternalComponentP[CommentTextProps]              = importSTComponent(Sui.CommentText)
  @inline def Confirm:                    ExternalComponentP[ConfirmProps]                  = importSTComponent(Sui.Confirm)
  @inline def Container:                  ExternalComponentP[ContainerProps]                = importSTComponent(Sui.Container)
  @inline def Dimmer:                     ExternalComponentP[DimmerProps]                   = importSTComponent(Sui.Dimmer)
  @inline def DimmerDimmable:             ExternalComponentP[DimmerDimmableProps]           = importSTComponent(Sui.DimmerDimmable)
  @inline def DimmerInner:                ExternalComponentP[DimmerInnerProps]              = importSTComponent(Sui.DimmerInner)
  @inline def Divider:                    ExternalComponentP[DividerProps]                  = importSTComponent(Sui.Divider)
  @inline def Dropdown:                   ExternalComponentP[DropdownProps]                 = importSTComponent(Sui.Dropdown)
  @inline def DropdownDivider:            ExternalComponentP[DropdownDividerProps]          = importSTComponent(Sui.DropdownDivider)
  @inline def DropdownHeader:             ExternalComponentP[DropdownHeaderProps]           = importSTComponent(Sui.DropdownHeader)
  @inline def DropdownItem:               ExternalComponentP[DropdownItemProps]             = importSTComponent(Sui.DropdownItem)
  @inline def DropdownMenu:               ExternalComponentP[DropdownMenuProps]             = importSTComponent(Sui.DropdownMenu)
  @inline def DropdownSearchInput:        ExternalComponentP[DropdownSearchInputProps]      = importSTComponent(Sui.DropdownSearchInput)
  @inline def Embed:                      ExternalComponentP[EmbedProps]                    = importSTComponent(Sui.Embed)
  @inline def Feed:                       ExternalComponentP[FeedProps]                     = importSTComponent(Sui.Feed)
  @inline def FeedContent:                ExternalComponentP[FeedContentProps]              = importSTComponent(Sui.FeedContent)
  @inline def FeedDate:                   ExternalComponentP[FeedDateProps]                 = importSTComponent(Sui.FeedDate)
  @inline def FeedEvent:                  ExternalComponentP[FeedEventProps]                = importSTComponent(Sui.FeedEvent)
  @inline def FeedExtra:                  ExternalComponentP[FeedExtraProps]                = importSTComponent(Sui.FeedExtra)
  @inline def FeedLabel:                  ExternalComponentP[FeedLabelProps]                = importSTComponent(Sui.FeedLabel)
  @inline def FeedLike:                   ExternalComponentP[FeedLikeProps]                 = importSTComponent(Sui.FeedLike)
  @inline def FeedMeta:                   ExternalComponentP[FeedMetaProps]                 = importSTComponent(Sui.FeedMeta)
  @inline def FeedSummary:                ExternalComponentP[FeedSummaryProps]              = importSTComponent(Sui.FeedSummary)
  @inline def FeedUser:                   ExternalComponentP[FeedUserProps]                 = importSTComponent(Sui.FeedUser)
  @inline def Flag:                       ExternalComponentP[FlagProps]                     = importSTComponent(Sui.Flag)
  @inline def Form:                       ExternalComponentP[FormProps]                     = importSTComponent(Sui.Form)
  @inline def FormButton:                 ExternalComponentP[FormButtonProps]               = importSTComponent(Sui.FormButton)
  @inline def FormCheckbox:               ExternalComponentP[FormCheckboxProps]             = importSTComponent(Sui.FormCheckbox)
  @inline def FormDropdown:               ExternalComponentP[FormDropdownProps]             = importSTComponent(Sui.FormDropdown)
  @inline def FormField:                  ExternalComponentP[FormFieldProps]                = importSTComponent(Sui.FormField)
  @inline def FormGroup:                  ExternalComponentP[FormGroupProps]                = importSTComponent(Sui.FormGroup)
  @inline def FormInput:                  ExternalComponentP[FormInputProps]                = importSTComponent(Sui.FormInput)
  @inline def FormRadio:                  ExternalComponentP[FormRadioProps]                = importSTComponent(Sui.FormRadio)
  @inline def FormSelect:                 ExternalComponentP[FormSelectProps]               = importSTComponent(Sui.FormSelect)
  @inline def FormTextArea:               ExternalComponentP[FormTextAreaProps]             = importSTComponent(Sui.FormTextArea)
  @inline def Grid:                       ExternalComponentP[GridProps]                     = importSTComponent(Sui.Grid)
  @inline def GridColumn:                 ExternalComponentP[GridColumnProps]               = importSTComponent(Sui.GridColumn)
  @inline def GridRow:                    ExternalComponentP[GridRowProps]                  = importSTComponent(Sui.GridRow)
  @inline def Header:                     ExternalComponentP[HeaderProps]                   = importSTComponent(Sui.Header)
  @inline def HeaderContent:              ExternalComponentP[HeaderContentProps]            = importSTComponent(Sui.HeaderContent)
  @inline def HeaderSubheader:            ExternalComponentP[HeaderSubheaderProps]          = importSTComponent(Sui.HeaderSubheader)
  @inline def Icon:                       ExternalComponentP[IconProps]                     = importSTComponent(Sui.Icon)
  @inline def IconGroup:                  ExternalComponentP[IconGroupProps]                = importSTComponent(Sui.IconGroup)
  @inline def Image:                      ExternalComponentP[ImageProps]                    = importSTComponent(Sui.Image)
  @inline def ImageGroup:                 ExternalComponentP[ImageGroupProps]               = importSTComponent(Sui.ImageGroup)
  @inline def Input:                      ExternalComponentP[InputProps]                    = importSTComponent(Sui.Input)
  @inline def Item:                       ExternalComponentP[ItemProps]                     = importSTComponent(Sui.Item)
  @inline def ItemContent:                ExternalComponentP[ItemContentProps]              = importSTComponent(Sui.ItemContent)
  @inline def ItemDescription:            ExternalComponentP[ItemDescriptionProps]          = importSTComponent(Sui.ItemDescription)
  @inline def ItemExtra:                  ExternalComponentP[ItemExtraProps]                = importSTComponent(Sui.ItemExtra)
  @inline def ItemGroup:                  ExternalComponentP[ItemGroupProps]                = importSTComponent(Sui.ItemGroup)
  @inline def ItemHeader:                 ExternalComponentP[ItemHeaderProps]               = importSTComponent(Sui.ItemHeader)
  @inline def ItemImage:                  ExternalComponentP[ItemImageProps]                = importSTComponent(Sui.ItemImage)
  @inline def ItemMeta:                   ExternalComponentP[ItemMetaProps]                 = importSTComponent(Sui.ItemMeta)
  @inline def Label:                      ExternalComponentP[LabelProps]                    = importSTComponent(Sui.Label)
  @inline def LabelDetail:                ExternalComponentP[LabelDetailProps]              = importSTComponent(Sui.LabelDetail)
  @inline def LabelGroup:                 ExternalComponentP[LabelGroupProps]               = importSTComponent(Sui.LabelGroup)
  @inline def List:                       ExternalComponentP[ListProps]                     = importSTComponent(Sui.List)
  @inline def ListContent:                ExternalComponentP[ListContentProps]              = importSTComponent(Sui.ListContent)
  @inline def ListDescription:            ExternalComponentP[ListDescriptionProps]          = importSTComponent(Sui.ListDescription)
  @inline def ListHeader:                 ExternalComponentP[ListHeaderProps]               = importSTComponent(Sui.ListHeader)
  @inline def ListIcon:                   ExternalComponentP[ListIconProps]                 = importSTComponent(Sui.ListIcon)
  @inline def ListItem:                   ExternalComponentP[ListItemProps]                 = importSTComponent(Sui.ListItem)
  @inline def ListList:                   ExternalComponentP[ListListProps]                 = importSTComponent(Sui.ListList)
  @inline def Loader:                     ExternalComponentP[LoaderProps]                   = importSTComponent(Sui.Loader)
  @inline def Menu:                       ExternalComponentP[MenuProps]                     = importSTComponent(Sui.Menu)
  @inline def MenuHeader:                 ExternalComponentP[MenuHeaderProps]               = importSTComponent(Sui.MenuHeader)
  @inline def MenuItem:                   ExternalComponentP[MenuItemProps]                 = importSTComponent(Sui.MenuItem)
  @inline def MenuMenu:                   ExternalComponentP[MenuMenuProps]                 = importSTComponent(Sui.MenuMenu)
  @inline def Message:                    ExternalComponentP[MessageProps]                  = importSTComponent(Sui.Message)
  @inline def MessageContent:             ExternalComponentP[MessageContentProps]           = importSTComponent(Sui.MessageContent)
  @inline def MessageHeader:              ExternalComponentP[MessageHeaderProps]            = importSTComponent(Sui.MessageHeader)
  @inline def MessageItem:                ExternalComponentP[MessageItemProps]              = importSTComponent(Sui.MessageItem)
  @inline def MessageList:                ExternalComponentP[MessageListProps]              = importSTComponent(Sui.MessageList)
  @inline def Modal:                      ExternalComponentP[ModalProps]                    = importSTComponent(Sui.Modal)
  @inline def ModalActions:               ExternalComponentP[ModalActionsProps]             = importSTComponent(Sui.ModalActions)
  @inline def ModalContent:               ExternalComponentP[ModalContentProps]             = importSTComponent(Sui.ModalContent)
  @inline def ModalDescription:           ExternalComponentP[ModalDescriptionProps]         = importSTComponent(Sui.ModalDescription)
  @inline def ModalHeader:                ExternalComponentP[ModalHeaderProps]              = importSTComponent(Sui.ModalHeader)
  @inline def MountNode:                  ExternalComponentP[MountNodeProps]                = importSTComponent(Sui.MountNode)
  @inline def Pagination:                 ExternalComponentP[PaginationProps]               = importSTComponent(Sui.Pagination)
  @inline def PaginationItem:             ExternalComponentP[PaginationItemProps]           = importSTComponent(Sui.PaginationItem)
  @inline def Placeholder:                ExternalComponentP[PlaceholderProps]              = importSTComponent(Sui.Placeholder)
  @inline def PlaceholderHeader:          ExternalComponentP[PlaceholderHeaderProps]        = importSTComponent(Sui.PlaceholderHeader)
  @inline def PlaceholderImage:           ExternalComponentP[PlaceholderImageProps]         = importSTComponent(Sui.PlaceholderImage)
  @inline def PlaceholderLine:            ExternalComponentP[PlaceholderLineProps]          = importSTComponent(Sui.PlaceholderLine)
  @inline def PlaceholderParagraph:       ExternalComponentP[PlaceholderParagraphProps]     = importSTComponent(Sui.PlaceholderParagraph)
  @inline def Popup:                      ExternalComponentP[PopupProps]                    = importSTComponent(Sui.Popup)
  @inline def PopupContent:               ExternalComponentP[PopupContentProps]             = importSTComponent(Sui.PopupContent)
  @inline def PopupHeader:                ExternalComponentP[PopupHeaderProps]              = importSTComponent(Sui.PopupHeader)
  @inline def Portal:                     ExternalComponentP[PortalProps]                   = importSTComponent(Sui.Portal)
  @inline def PortalInner:                ExternalComponentP[PortalInnerProps]              = importSTComponent(Sui.PortalInner)
  @inline def Progress:                   ExternalComponentP[ProgressProps]                 = importSTComponent(Sui.Progress)
  @inline def Radio:                      ExternalComponentP[RadioProps]                    = importSTComponent(Sui.Radio)
  @inline def Rail:                       ExternalComponentP[RailProps]                     = importSTComponent(Sui.Rail)
  @inline def Rating:                     ExternalComponentP[RatingProps]                   = importSTComponent(Sui.Rating)
  @inline def RatingIcon:                 ExternalComponentP[RatingIconProps]               = importSTComponent(Sui.RatingIcon)
  @inline def Ref:                        ExternalComponentP[RefProps]                      = importSTComponent(Sui.Ref)
  @inline def RefFindNode:                ExternalComponentP[RefFindNodeProps]              = importSTComponent(Sui.RefFindNode)
  @inline def RefForward:                 ExternalComponentP[RefForwardProps]               = importSTComponent(Sui.RefForward)
  @inline def Responsive:                 ExternalComponentP[ResponsiveProps]               = importSTComponent(Sui.Responsive)
  @inline def Reveal:                     ExternalComponentP[RevealProps]                   = importSTComponent(Sui.Reveal)
  @inline def RevealContent:              ExternalComponentP[RevealContentProps]            = importSTComponent(Sui.RevealContent)
  @inline def Search:                     ExternalComponentP[SearchProps]                   = importSTComponent(Sui.Search)
  @inline def SearchCategory:             ExternalComponentP[SearchCategoryProps]           = importSTComponent(Sui.SearchCategory)
  @inline def SearchResult:               ExternalComponentP[SearchResultProps]             = importSTComponent(Sui.SearchResult)
  @inline def SearchResults:              ExternalComponentP[SearchResultsProps]            = importSTComponent(Sui.SearchResults)
  @inline def Segment:                    ExternalComponentP[SegmentProps]                  = importSTComponent(Sui.Segment)
  @inline def SegmentGroup:               ExternalComponentP[SegmentGroupProps]             = importSTComponent(Sui.SegmentGroup)
  @inline def SegmentInline:              ExternalComponentP[SegmentInlineProps]            = importSTComponent(Sui.SegmentInline)
  @inline def Select:                     ExternalComponentP[SelectProps]                   = importSTComponent(Sui.Select)
  @inline def Sidebar:                    ExternalComponentP[SidebarProps]                  = importSTComponent(Sui.Sidebar)
  @inline def SidebarPushable:            ExternalComponentP[SidebarPushableProps]          = importSTComponent(Sui.SidebarPushable)
  @inline def SidebarPusher:              ExternalComponentP[SidebarPusherProps]            = importSTComponent(Sui.SidebarPusher)
  @inline def Statistic:                  ExternalComponentP[StatisticProps]                = importSTComponent(Sui.Statistic)
  @inline def StatisticGroup:             ExternalComponentP[StatisticGroupProps]           = importSTComponent(Sui.StatisticGroup)
  @inline def StatisticLabel:             ExternalComponentP[StatisticLabelProps]           = importSTComponent(Sui.StatisticLabel)
  @inline def StatisticValue:             ExternalComponentP[StatisticValueProps]           = importSTComponent(Sui.StatisticValue)
  @inline def Step:                       ExternalComponentP[StepProps]                     = importSTComponent(Sui.Step)
  @inline def StepContent:                ExternalComponentP[StepContentProps]              = importSTComponent(Sui.StepContent)
  @inline def StepDescription:            ExternalComponentP[StepDescriptionProps]          = importSTComponent(Sui.StepDescription)
  @inline def StepGroup:                  ExternalComponentP[StepGroupProps]                = importSTComponent(Sui.StepGroup)
  @inline def StepTitle:                  ExternalComponentP[StepTitleProps]                = importSTComponent(Sui.StepTitle)
  @inline def Sticky:                     ExternalComponentP[StickyProps]                   = importSTComponent(Sui.Sticky)
  @inline def Tab:                        ExternalComponentP[TabProps]                      = importSTComponent(Sui.Tab)
  @inline def Table:                      ExternalComponentP[TableProps]                    = importSTComponent(Sui.Table)
  @inline def TableBody:                  ExternalComponentP[TableBodyProps]                = importSTComponent(Sui.TableBody)
  @inline def TableCell:                  ExternalComponentP[TableCellProps]                = importSTComponent(Sui.TableCell)
  @inline def TableFooter:                ExternalComponentP[TableFooterProps]              = importSTComponent(Sui.TableFooter)
  @inline def TableHeader:                ExternalComponentP[TableHeaderProps]              = importSTComponent(Sui.TableHeader)
  @inline def TableHeaderCell:            ExternalComponentP[TableHeaderCellProps]          = importSTComponent(Sui.TableHeaderCell)
  @inline def TableRow:                   ExternalComponentP[TableRowProps]                 = importSTComponent(Sui.TableRow)
  @inline def TabPane:                    ExternalComponentP[TabPaneProps]                  = importSTComponent(Sui.TabPane)
  @inline def TextArea:                   ExternalComponentP[TextAreaProps]                 = importSTComponent(Sui.TextArea)
  @inline def Transition:                 ExternalComponentP[TransitionProps]               = importSTComponent(Sui.Transition)
  @inline def TransitionablePortal:       ExternalComponentP[TransitionablePortalProps]     = importSTComponent(Sui.TransitionablePortal)
  @inline def TransitionGroup:            ExternalComponentP[TransitionGroupProps]          = importSTComponent(Sui.TransitionGroup)
  @inline def Visibility:                 ExternalComponentP[VisibilityProps]               = importSTComponent(Sui.Visibility)

}

@react object App {

import SuiFacade._

  type Props = Unit

  private val suiCSS = SUICSS

  val component = FunctionalComponent[Props] { _ =>
    val (isModalVisible, updateIsModalVisible) = useState(false)
    val (selectValue, updateSelectValue) = useState("lucy")

    // val renderIntro = Row(RowProps())(
    //   Col(ColProps(span = 7)),
    //   Col(ColProps(span = 10))(
    //     header(className := "App-header")(
    //       img(src := ReactLogo.asInstanceOf[String], className := "App-logo", alt := "logo"),
    //       h1(className := "App-title")("Welcome to React (with Scala.js!)")
    //     ),
    //     p(className := "App-intro")(
    //       "To get started, edit ", code("App.scala"), " and save to reload."
    //     )
    //   ),
    //   Col(ColProps(span = 7))
    // )

    val renderCard = section(
      // Header(HeaderProps())("Card"),
      h2("Card"),
      Card(CardProps(color = SuiStrings.orange))("Card!")
    )

    // val renderButton = section(
    //   h2("Button"),
    //   Button(ButtonProps(
    //     // icon = "download",
    //     // `type` = antdLibStrings.primary
    //   ))("Download")
    // )

    // val renderProgress = section(
    //   h2("Progress"),
    //   Progress(ProgressProps(
    //     percent = 70
    //     // icon = "download",
    //     // `type` = antdLibStrings.primary
    //   ))("Download")
    // )

    div(className := "App")(
      // renderIntro,
      div(
        renderCard,
        // Gives element type 'undefined'
        Input(InputProps())
        // renderProgress
        // renderButton
      )
    )
  }
}
